package CanvasApp.ViewModel.SelectionManager.Cmd;

import CanvasApp.Model.ShapeModel;
import CanvasApp.ViewModel.SelectionManager.SelectionManager;

import Command.Command;

public class Select implements Command {
    private final SelectionManager selectionManager;
    private final ShapeModel shape;

    public Select(SelectionManager selectionManager, ShapeModel shape) {
        this.selectionManager = selectionManager;
        this.shape = shape;
    }

    @Override
    public void execute() {
        selectionManager.unselectAll();
        selectionManager.toggleSelection(shape.getId());
    }
}