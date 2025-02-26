package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.changeSize(20);
        window.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(100);
        wall.moveVertical(100);
        wall.changeSize(100);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(170);
        wall.moveVertical(70);
        wall.changeSize(30);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(170);
        wall.moveVertical(50);
        wall.changeSize(30);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(0);
        wall.moveVertical(50);
        wall.changeSize(30);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(0);
        wall.moveVertical(30);
        wall.changeSize(30);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(70);
        wall.moveVertical(50);
        wall.changeSize(30);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(70);
        wall.moveVertical(30);
        wall.changeSize(30);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(50, 40);
        roof.moveHorizontal(25);
        roof.moveVertical(15);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(50, 40);
        roof.moveHorizontal(95);
        roof.moveVertical(15);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(50, 40);
        roof.moveHorizontal(195);
        roof.moveVertical(45);
        roof.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(35);
        window.moveVertical(145);
        window.changeSize(33);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(75);
        window.moveVertical(145);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(75);
        window.moveVertical(145);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(75);
        window.moveVertical(55);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(55);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.moveVertical(145);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(145);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(115);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(175);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(120);
        window.moveVertical(145);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(177);
        window.moveVertical(85);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(120);
        window.moveVertical(115);
        window.changeSize(15);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(120);
        window.moveVertical(175);
        window.changeSize(15);
        window.makeVisible();

        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(74);
        sun.moveVertical(125);
        sun.changeSize(34);
        sun.makeVisible();

        roof = new Triangle();
        roof.changeSize(200, 2000);
        roof.moveHorizontal(60);
        roof.moveVertical(200);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(10);
        sun.moveVertical(-60);
        sun.changeSize(50);
        sun.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(70);
        window.moveVertical(100);
        window.changeSize(20);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(20, 20);
        roof.moveHorizontal(60);
        roof.moveVertical(185);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(85);
        sun.moveVertical(138);
        sun.changeSize(10);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(87);
        sun.moveVertical(140);
        sun.changeSize(3);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(90);
        sun.moveVertical(140);
        sun.changeSize(3);
        sun.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(48);
        window.moveVertical(158);
        window.changeSize(5);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(48);
        window.moveVertical(160);
        window.changeSize(5);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(48);
        window.moveVertical(164);
        window.changeSize(5);
        window.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("black");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("red");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

