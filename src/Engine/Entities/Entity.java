package Engine.Entities;

import Engine.GFX.SImage;
import Engine.Renderer;

import java.util.ArrayList;

public class Entity {


    public int positionX, positionY;
    private ArrayList<Component> components;
    private ArrayList<SImage> images;


    //TODO: some way to add components on object
    //TODO: something like "getcomponent" method
    public Entity(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
        this.images = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    public void addImage(SImage image){
        this.images.add(image);
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    public <T>Component getComponent(T t){
        for (Component comp: this.components) {
            if(comp.getClass().equals(t.getClass())){
                return comp;
            }
        }
        return null;
    }

    public void update(){
        for (Component comp: components) {
            comp.update();
        }
    }

    public void render(Renderer renderer){
        for (SImage ima: images) {
            renderer.drawImage(ima, positionX + ima.getOffSetWidth(), positionY + ima.getOffSetHeight());
        }
    }
}
