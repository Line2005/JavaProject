package entity.element;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;

public class SpriteTest extends TestCase {
    private Sprite sprite;

    @Before
    public void setUp() {
        // Create a Sprite instance for testing
        sprite = new Sprite('A', "testImage.jpg");
    }

    public void tearDown() throws Exception {
    }

    public void testGetImage() {
        // Create a dummy Image object for testing
        Image dummyImage = createDummyImage();

        // Create a Sprite for testing
        Sprite sprite = new Sprite('A');

        // Set the dummy Image using private method (for testing purposes)
        setPrivateImage(sprite, dummyImage);

        // Check if getImage returns the expected Image
        assertEquals(dummyImage, sprite.getImage());
    }

    // Private method to set the Image (for testing purposes only)
    private void setPrivateImage(Sprite sprite, Image image) {
        try {
            java.lang.reflect.Field field = Sprite.class.getDeclaredField("image");
            field.setAccessible(true);
            field.set(sprite, image);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public void testLoadImage() {
        // Create a Sprite for testing with an image file that will cause an IOException
        Sprite sprite = new Sprite('C', "invalid_image.jpg");

        // Load the image
        try {
            sprite.loadImage();

        } catch (IOException e) {
            // Check if the IOException is caught
            assertFalse(sprite.isImageLoaded());
            assertNull(sprite.getImage());
        }
    }

    public void testGetConsoleImage() {
        assertEquals('A', sprite.getConsoleImage());
    }

    public void testGetImageName() {
        // Test the getImageName method
        String expectedImageName = "testImage.jpg";
        String actualImageName = sprite.getImageName();

        // Assert that the actual image name matches the expected value
        assertEquals(expectedImageName, actualImageName);
    }

    public void testIsImageLoaded() {
        // Test the isImageLoaded method

        // Initially, it should be false
        assertEquals(false, sprite.isImageLoaded());

        // Set the image loaded status to true
        sprite.setImageLoaded(true);

        // Now, it should be true
        assertEquals(true, sprite.isImageLoaded());

        // Set the image loaded status back to false
        sprite.setImageLoaded(false);

        // Now, it should be false again
        assertEquals(false, sprite.isImageLoaded());
    }


    @Test
    public void testSetImageLoaded() {
        // Test the setImageLoaded method
        boolean expectedImageLoadedStatus = true;

        // Call setImageLoaded with the expected status
        sprite.setImageLoaded(expectedImageLoadedStatus);

        // Retrieve the actual imageLoaded status
        boolean actualImageLoadedStatus = sprite.isImageLoaded();

        // Assert that the internal state has been updated correctly
        assertEquals(expectedImageLoadedStatus, actualImageLoadedStatus);
    }
    // Dummy method to create a dummy Image object
    private Image createDummyImage() {
        return null;
    }
}
