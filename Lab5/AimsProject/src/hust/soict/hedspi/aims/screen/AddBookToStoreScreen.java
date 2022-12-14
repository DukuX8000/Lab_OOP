package hust.soict.hedspi.aims.screen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddBookToStoreScreen {

	public Scene getBookScreen(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Book.fxml"));
		BookController controller = new BookController(stage);
		loader.setController(controller);
		Parent root = loader.load();
		return new Scene(root);
	}

}
