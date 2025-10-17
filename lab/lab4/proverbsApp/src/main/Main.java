package main;

import controller.Controller;
import model.Model;
import view.View;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View("Proverbs App");
        Controller controller = new Controller(model);

        view.setListener(controller);
        model.addObserver(view);
        model.chooseProverb();  // per aprirlo gia  con un proverbio scritto se no ""
    }
}