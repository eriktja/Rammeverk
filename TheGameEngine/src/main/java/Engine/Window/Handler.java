package Engine.Window;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void tick(){
        for (int i = 0; i < objects.size(); i++){
            objects.get(i).tick();
        }
    }

    public void render(Graphics g){
        for (GameObject object : objects){
            object.render(g);
        }
    }

    public void addObject(GameObject object){
        this.objects.add(object);
    }

    public void removeObject(GameObject object){
        this.objects.remove(object);
    }
}
