package CanvasApp.Model.Composite.Event;

import Observer.Event;

public class ShapeRemoved extends Event<String> {
    public ShapeRemoved(String source) {
        super(source);
    }
}
