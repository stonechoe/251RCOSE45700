package CanvasApp.Model.Decorator;

import CanvasApp.Model.Decorator.Event.DecoratorStateChanged;
import CanvasApp.Model.ShapeModel;

public class InnerText extends ShapeDecorator {
    private String text;

    public InnerText(ShapeModel decorated, String text) {
        super(decorated);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        String oldText = this.text;
        if (oldText == null || !oldText.equals(newText)) {
            this.text = newText;
            notify(new DecoratorStateChanged(this));
        }
    }

    @Override
    public void updateOwnState(ShapeDecorator decorator) {
        if(decorator instanceof InnerText textDeco) {
            setText(textDeco.getText());
        }
    }
}