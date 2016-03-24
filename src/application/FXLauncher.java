package application;
	
import com.jfoenix.controls.JFXDecorator;

import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.container.DefaultFlowContainer;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXLauncher extends Application {

	@FXMLViewFlowContext private ViewFlowContext flowContext;
	
	@Override
	public void start(Stage stage) throws FlowException {
		
		Flow flow = new Flow(MainController.class);
		DefaultFlowContainer container = new DefaultFlowContainer();
		flowContext = new ViewFlowContext();
		flowContext.register("Stage", stage);
		flow.createHandler(flowContext).start(container);
		
		Scene scene = new Scene(new JFXDecorator(stage, container.getView()), 800, 800);
		
		scene.getStylesheets().add(FXLauncher.class.getResource("/resources/css/jfoenix-fonts.css").toExternalForm());
		scene.getStylesheets().add(FXLauncher.class.getResource("/resources/css/jfoenix-design.css").toExternalForm());
		scene.getStylesheets().add(FXLauncher.class.getResource("/resources/css/jfoenix-main-demo.css").toExternalForm());
		
		stage.setMinWidth(600);
		stage.setMinHeight(600);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
