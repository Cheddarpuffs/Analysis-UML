package application;

import javax.annotation.PostConstruct;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.util.VetoException;

@FXMLController(value = "/resources/fxml/main.fxml", title = "KabaSuji")
public class MainController {

	@PostConstruct
	public void init() throws FlowException, VetoException {
	}
}
