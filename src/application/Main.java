package application;

import java.math.BigInteger;
import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
	private ObservableList<String> items = FXCollections.observableArrayList();
	TextField textField1;
	TextField textField2;
	TextField textField3;
	TextField textField4;
	TextField textField5;

	Button button0 = new Button();
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	Button button4 = new Button();
	Button button5 = new Button();
	Button button6 = new Button();
	Button button7 = new Button();
	Button button8 = new Button();
	Button button9 = new Button();
	Button buttonDot = new Button();

	Image vndFlag = new Image("application/Flag_of_Vietnam.svg.png");
	Image usdFlag = new Image("application/Flag_of_the_United_States.png");
	Image audFlag = new Image("application/Flag_of_Victoria_(Australia).svg.png");
	Image jpyFlag = new Image("application/2560px-Japan_flag_-_variant.png");
	Image krwFlag = new Image("application/Flag_of_South_Korea.png");

	MenuButton menuButton1 = new MenuButton("VND");
	MenuButton menuButton2 = new MenuButton("USD");
	MenuButton menuButton3 = new MenuButton("AUD");
	MenuButton menuButton4 = new MenuButton("JPY");
	MenuButton menuButton5 = new MenuButton("KRW");

	MenuItem item11 = new MenuItem("VND");
	MenuItem item12 = new MenuItem("USD");
	MenuItem item13 = new MenuItem("AUD");
	MenuItem item14 = new MenuItem("JPY");
	MenuItem item15 = new MenuItem("KRW");

	MenuItem item21 = new MenuItem("VND");
	MenuItem item22 = new MenuItem("USD");
	MenuItem item23 = new MenuItem("AUD");
	MenuItem item24 = new MenuItem("JPY");
	MenuItem item25 = new MenuItem("KRW");

	MenuItem item31 = new MenuItem("VND");
	MenuItem item32 = new MenuItem("USD");
	MenuItem item33 = new MenuItem("AUD");
	MenuItem item34 = new MenuItem("JPY");
	MenuItem item35 = new MenuItem("KRW");

	MenuItem item41 = new MenuItem("VND");
	MenuItem item42 = new MenuItem("USD");
	MenuItem item43 = new MenuItem("AUD");
	MenuItem item44 = new MenuItem("JPY");
	MenuItem item45 = new MenuItem("KRW");

	MenuItem item51 = new MenuItem("VND");
	MenuItem item52 = new MenuItem("USD");
	MenuItem item53 = new MenuItem("AUD");
	MenuItem item54 = new MenuItem("JPY");
	MenuItem item55 = new MenuItem("KRW");

	ImageView imageview1 = new ImageView(
			new Image(getClass().getResourceAsStream("/application/Flag_of_Vietnam.svg.png")));
	ImageView imageview2 = new ImageView(
			new Image(getClass().getResourceAsStream("/application/Flag_of_the_United_States.png")));
	ImageView imageview3 = new ImageView(
			new Image(getClass().getResourceAsStream("/application/Flag_of_Victoria_(Australia).svg.png")));
	ImageView imageview4 = new ImageView(
			new Image(getClass().getResourceAsStream("/application/2560px-Japan_flag_-_variant.png")));
	ImageView imageview5 = new ImageView(
			new Image(getClass().getResourceAsStream("/application/Flag_of_South_Korea.png")));

	String selectedMenu = "";
	Image imageSet;

	public void handleMenuItemClick1(ActionEvent event) {
		MenuItem menuItem = (MenuItem) event.getSource();
		String menuItemText = menuItem.getText();
		if (menuItemText.equals("VND")) {
			imageSet = vndFlag;
		}
		if (menuItemText.equals("USD")) {
			imageSet = usdFlag;
		}
		if (menuItemText.equals("AUD")) {
			imageSet = audFlag;
		}
		if (menuItemText.equals("JPY")) {
			imageSet = jpyFlag;
		}
		if (menuItemText.equals("KRW")) {
			imageSet = krwFlag;
		}
		if (selectedMenu.equals("menu1")) {
			menuButton1.setText(menuItemText);
			imageview1.setImage(imageSet);
		}
		if (selectedMenu.equals("menu2")) {
			menuButton2.setText(menuItemText);
			imageview2.setImage(imageSet);
		}
		if (selectedMenu.equals("menu3")) {
			menuButton3.setText(menuItemText);
			imageview3.setImage(imageSet);
		}
		if (selectedMenu.equals("menu4")) {
			menuButton4.setText(menuItemText);
			imageview4.setImage(imageSet);
		}
		if (selectedMenu.equals("menu5")) {
			menuButton5.setText(menuItemText);
			imageview5.setImage(imageSet);
		}
	}

	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);

		VBox innerVBox = new VBox();
		innerVBox.setSpacing(5);
		innerVBox.setAlignment(Pos.CENTER);

		Label titleLabel = new Label("Currency Converter");
		titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		titleLabel.setAlignment(Pos.CENTER);

		Label nameLabel = new Label("Truong Phu");
		nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		nameLabel.setAlignment(Pos.CENTER);

		innerVBox.getChildren().addAll(titleLabel, nameLabel);

		// GridPane
		GridPane gridPane = new GridPane();
		gridPane.setPrefHeight(225.0);
		gridPane.setPrefWidth(396.0);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		col1.setMaxWidth(141.0);
		col1.setMinWidth(10.0);
		col1.setPrefWidth(87.0);

		ColumnConstraints col2 = new ColumnConstraints();
		col2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		col2.setMaxWidth(162.0);
		col2.setMinWidth(10.0);
		col2.setPrefWidth(76.0);

		ColumnConstraints col3 = new ColumnConstraints();
		col3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		col3.setMaxWidth(233.0);
		col3.setMinWidth(10.0);
		col3.setPrefWidth(233.0);

		RowConstraints row = new RowConstraints();
		row.setMinHeight(10.0);
		row.setPrefHeight(30.0);
		row.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

		gridPane.getColumnConstraints().addAll(col1, col2, col3);
		gridPane.getRowConstraints().addAll(row, row, row, row, row);

		textField1 = new TextField();
		imageview1.setFitHeight(33.0);
		imageview1.setFitWidth(59.0);
		imageview1.setPickOnBounds(true);
		imageview1.setPreserveRatio(true);
		GridPane.setHalignment(imageview1, javafx.geometry.HPos.CENTER);
		GridPane.setValignment(imageview1, javafx.geometry.VPos.CENTER);

		item11.setOnAction(this::handleMenuItemClick1);
		item12.setOnAction(this::handleMenuItemClick1);
		item13.setOnAction(this::handleMenuItemClick1);
		item14.setOnAction(this::handleMenuItemClick1);
		item15.setOnAction(this::handleMenuItemClick1);

		menuButton1.getItems().addAll(item11, item12, item13, item14, item15);
		menuButton1.setOnMouseClicked(event -> selectedMenu = "menu1");

		gridPane.add(imageview1, 0, 0);
		gridPane.add(menuButton1, 1, 0);
		gridPane.add(textField1, 2, 0);

		textField2 = new TextField();
		textField2.setEditable(false);
		imageview2.setFitHeight(33.0);
		imageview2.setFitWidth(59.0);
		imageview2.setPickOnBounds(true);
		imageview2.setPreserveRatio(true);
		GridPane.setHalignment(imageview2, javafx.geometry.HPos.CENTER);
		GridPane.setValignment(imageview2, javafx.geometry.VPos.CENTER);

		item21.setOnAction(this::handleMenuItemClick1);
		item22.setOnAction(this::handleMenuItemClick1);
		item23.setOnAction(this::handleMenuItemClick1);
		item24.setOnAction(this::handleMenuItemClick1);
		item25.setOnAction(this::handleMenuItemClick1);

		menuButton2.getItems().addAll(item21, item22, item23, item24, item25);
		menuButton2.setOnMouseClicked(event -> selectedMenu = "menu2");

		gridPane.add(imageview2, 0, 1);
		gridPane.add(menuButton2, 1, 1);
		gridPane.add(textField2, 2, 1);

		textField3 = new TextField();
		textField3.setEditable(false);
		imageview3.setFitHeight(33.0);
		imageview3.setFitWidth(59.0);
		imageview3.setPickOnBounds(true);
		imageview3.setPreserveRatio(true);
		GridPane.setHalignment(imageview3, javafx.geometry.HPos.CENTER);
		GridPane.setValignment(imageview3, javafx.geometry.VPos.CENTER);

		item31.setOnAction(this::handleMenuItemClick1);
		item32.setOnAction(this::handleMenuItemClick1);
		item33.setOnAction(this::handleMenuItemClick1);
		item34.setOnAction(this::handleMenuItemClick1);
		item35.setOnAction(this::handleMenuItemClick1);

		menuButton3.getItems().addAll(item31, item32, item33, item34, item35);
		menuButton3.setOnMouseClicked(event -> selectedMenu = "menu3");

		gridPane.add(imageview3, 0, 2);
		gridPane.add(menuButton3, 1, 2);
		gridPane.add(textField3, 2, 2);

		textField4 = new TextField();
		textField4.setEditable(false);
		imageview4.setFitHeight(33.0);
		imageview4.setFitWidth(59.0);
		imageview4.setPickOnBounds(true);
		imageview4.setPreserveRatio(true);
		GridPane.setHalignment(imageview4, javafx.geometry.HPos.CENTER);
		GridPane.setValignment(imageview4, javafx.geometry.VPos.CENTER);

		item41.setOnAction(this::handleMenuItemClick1);
		item42.setOnAction(this::handleMenuItemClick1);
		item43.setOnAction(this::handleMenuItemClick1);
		item44.setOnAction(this::handleMenuItemClick1);
		item45.setOnAction(this::handleMenuItemClick1);

		menuButton4.getItems().addAll(item41, item42, item43, item44, item45);
		menuButton4.setOnMouseClicked(event -> selectedMenu = "menu4");

		gridPane.add(imageview4, 0, 3);
		gridPane.add(menuButton4, 1, 3);
		gridPane.add(textField4, 2, 3);

		textField5 = new TextField();
		textField5.setEditable(false);
		imageview5.setFitHeight(33.0);
		imageview5.setFitWidth(59.0);
		imageview5.setPickOnBounds(true);
		imageview5.setPreserveRatio(true);
		GridPane.setHalignment(imageview5, javafx.geometry.HPos.CENTER);
		GridPane.setValignment(imageview5, javafx.geometry.VPos.CENTER);

		item51.setOnAction(this::handleMenuItemClick1);
		item52.setOnAction(this::handleMenuItemClick1);
		item53.setOnAction(this::handleMenuItemClick1);
		item54.setOnAction(this::handleMenuItemClick1);
		item55.setOnAction(this::handleMenuItemClick1);

		menuButton5.getItems().addAll(item51, item52, item53, item54, item55);
		menuButton5.setOnMouseClicked(event -> selectedMenu = "menu5");

		gridPane.add(imageview5, 0, 4);
		gridPane.add(menuButton5, 1, 4);
		gridPane.add(textField5, 2, 4);

		/**
		 * HBox
		 */

		HBox hBox = new HBox();
		hBox.setPrefHeight(173.0);
		hBox.setPrefWidth(396.0);

		GridPane gridPane1 = new GridPane();
		ColumnConstraints columnConstraints1 = new ColumnConstraints();
		columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints1.setMinWidth(10.0);
		columnConstraints1.setPrefWidth(100.0);
		gridPane1.getColumnConstraints().add(columnConstraints1);

		RowConstraints rowConstraints1 = new RowConstraints();
		rowConstraints1.setMinHeight(10.0);
		rowConstraints1.setPrefHeight(30.0);
		rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane1.getRowConstraints().add(rowConstraints1);

		RowConstraints rowConstraints2 = new RowConstraints();
		rowConstraints2.setMinHeight(10.0);
		rowConstraints2.setPrefHeight(30.0);
		rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane1.getRowConstraints().add(rowConstraints2);

		Button historyButton = new Button();
		historyButton.setOnAction(e -> handleHistoryButton());
		ImageView historyImageView = new ImageView(
				new Image(getClass().getResourceAsStream("/application/calculator.png")));
		historyImageView.setFitHeight(45.0);
		historyImageView.setFitWidth(48.0);
		historyImageView.setPickOnBounds(true);
		historyImageView.setPreserveRatio(true);
		historyButton.setGraphic(historyImageView);
		gridPane1.add(historyButton, 0, 0);

		Button exchangeButton = new Button();
		exchangeButton.setOnAction(e -> handleExchangeButton());
		ImageView exchangeImageView = new ImageView(
				new Image(getClass().getResourceAsStream("/application/currency.png")));
		exchangeImageView.setFitHeight(50.0);
		exchangeImageView.setFitWidth(48.0);
		exchangeImageView.setPickOnBounds(true);
		exchangeImageView.setPreserveRatio(true);
		exchangeButton.setGraphic(exchangeImageView);
		gridPane1.add(exchangeButton, 0, 1);

		GridPane gridPane2 = new GridPane();
		gridPane2.setPrefHeight(100.0);
		gridPane2.setPrefWidth(288.0);

		ColumnConstraints columnConstraints = new ColumnConstraints();
		columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints.setMinWidth(10.0);
		columnConstraints.setPrefWidth(100.0);
		gridPane2.getColumnConstraints().add(columnConstraints);

		ColumnConstraints columnConstraints2 = new ColumnConstraints();
		columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints2.setMinWidth(10.0);
		columnConstraints2.setPrefWidth(100.0);
		gridPane2.getColumnConstraints().add(columnConstraints2);

		ColumnConstraints columnConstraints3 = new ColumnConstraints();
		columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
		columnConstraints3.setMinWidth(10.0);
		columnConstraints3.setPrefWidth(100.0);
		gridPane2.getColumnConstraints().add(columnConstraints3);

		RowConstraints rowConstraints3 = new RowConstraints();
		rowConstraints3.setMinHeight(10.0);
		rowConstraints3.setPrefHeight(30.0);
		rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane2.getRowConstraints().add(rowConstraints3);

		RowConstraints rowConstraints4 = new RowConstraints();
		rowConstraints4.setMinHeight(10.0);
		rowConstraints4.setPrefHeight(30.0);
		rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane2.getRowConstraints().add(rowConstraints4);

		RowConstraints rowConstraints5 = new RowConstraints();
		rowConstraints5.setMinHeight(10.0);
		rowConstraints5.setPrefHeight(30.0);
		rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane2.getRowConstraints().add(rowConstraints5);

		RowConstraints rowConstraints6 = new RowConstraints();
		rowConstraints6.setMinHeight(10.0);
		rowConstraints6.setPrefHeight(30.0);
		rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
		gridPane2.getRowConstraints().add(rowConstraints6);

		button7.setText("7");
		button7.setOnAction(e -> handleNumberButton("7"));
		button7.setPrefHeight(36.0);
		button7.setPrefWidth(98.0);
		GridPane.setMargin(button7, new Insets(1.0));
		gridPane2.add(button7, 0, 0);

		button4.setText("4");
		button4.setOnAction(e -> handleNumberButton("4"));
		button4.setPrefHeight(36.0);
		button4.setPrefWidth(98.0);
		GridPane.setMargin(button4, new Insets(1.0));
		gridPane2.add(button4, 0, 1);

		button1.setText("1");
		button1.setOnAction(e -> handleNumberButton("1"));
		button1.setPrefHeight(36.0);
		button1.setPrefWidth(98.0);
		GridPane.setMargin(button1, new Insets(1.0));
		gridPane2.add(button1, 0, 2);

		button0.setText("0");
		button0.setOnAction(e -> handleNumberButton("0"));
		button0.setPrefHeight(36.0);
		button0.setPrefWidth(98.0);
		GridPane.setMargin(button0, new Insets(1.0));
		gridPane2.add(button0, 0, 3);

		button8.setText("8");
		button8.setOnAction(e -> handleNumberButton("8"));
		button8.setPrefHeight(36.0);
		button8.setPrefWidth(98.0);
		GridPane.setMargin(button8, new Insets(1.0));
		gridPane2.add(button8, 1, 0);

		button5.setText("5");
		button5.setOnAction(e -> handleNumberButton("5"));
		button5.setPrefHeight(36.0);
		button5.setPrefWidth(98.0);
		GridPane.setMargin(button5, new Insets(1.0));
		gridPane2.add(button5, 1, 1);

		button2.setText("2");
		button2.setOnAction(e -> handleNumberButton("2"));
		button2.setPrefHeight(36.0);
		button2.setPrefWidth(98.0);
		GridPane.setMargin(button2, new Insets(1.0));
		gridPane2.add(button2, 1, 2);

		buttonDot.setText(".");
		buttonDot.setOnAction(e -> handleDotButton("."));
		buttonDot.setPrefHeight(36.0);
		buttonDot.setPrefWidth(98.0);
		GridPane.setMargin(buttonDot, new Insets(1.0));
		gridPane2.add(buttonDot, 1, 3);

		button9.setText("9");
		button9.setOnAction(e -> handleNumberButton("9"));
		button9.setPrefHeight(36.0);
		button9.setPrefWidth(98.0);
		GridPane.setMargin(button9, new Insets(1.0));
		gridPane2.add(button9, 2, 0);

		button6.setText("6");
		button6.setOnAction(e -> handleNumberButton("6"));
		button6.setPrefHeight(36.0);
		button6.setPrefWidth(98.0);
		GridPane.setMargin(button6, new Insets(1.0));
		gridPane2.add(button6, 2, 1);

		button3.setText("3");
		button3.setOnAction(e -> handleNumberButton("3"));
		button3.setPrefHeight(36.0);
		button3.setPrefWidth(98.0);
		GridPane.setMargin(button3, new Insets(1.0));
		gridPane2.add(button3, 2, 2);

		Button buttonDel = new Button();
		buttonDel.setText("Del");
		buttonDel.setOnAction(e -> handleDelButton());
		buttonDel.setPrefHeight(36.0);
		buttonDel.setPrefWidth(98.0);
		GridPane.setMargin(buttonDel, new Insets(1.0));
		gridPane2.add(buttonDel, 2, 3);

		hBox.getChildren().addAll(gridPane1, gridPane2);

		root.getChildren().addAll(innerVBox, gridPane, hBox);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public String formatNumber(Double n) {
		if (n % 1 == 0) {
			int intNumber = n.intValue();
			DecimalFormat decimalFormat = new DecimalFormat("#,##0");
			return decimalFormat.format(intNumber);
		}
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
		return decimalFormat.format(n);
	}

	private void handleDelButton() {
		textField1.clear();
		textField2.clear();
		textField3.clear();
		textField4.clear();
		textField5.clear();
	}

	private void handleDotButton(String number) {
		String currentText = textField1.getText();
		// Kiểm tra xem nếu đã có dấu chấm trong nội dung của textField1 thì không thêm
		// số mới
		if (!currentText.contains(".")) {
			// Thêm số mới vào nội dung hiện tại
			String newText = currentText + number;

			// Đặt nội dung mới cho textField1
			textField1.setText(newText);

			// Chỉnh sửa văn bản để thêm dấu phẩy ngăn cách hàng ngàn
			String formattedText = addThousandSeparator(newText);

			// Cập nhật văn bản trong textField1 với định dạng số hàng ngàn
			textField1.setText(formattedText);
		}
	}

	private void handleNumberButton(String number) {
		String currentText = textField1.getText();
		String newText = currentText + number;
		textField1.setText(newText);
		String formattedText = addThousandSeparator(newText);
		textField1.setText(formattedText);
	}

	private String addThousandSeparator(String text) {
		// Kiểm tra xem văn bản có dấu phẩy không
		boolean hasComma = text.contains(",");

		// Tạo một đối tượng DecimalFormat với mẫu "#,###" để thêm dấu phẩy phân cách
		// hàng ngàn
		DecimalFormat decimalFormat = new DecimalFormat("#,###");

		// Chuyển đổi văn bản thành số nguyên
		BigInteger number;
		try {
			// Xóa dấu phẩy nếu có
			number = new BigInteger(text.replace(",", ""));
		} catch (NumberFormatException e) {
			// Trường hợp số không hợp lệ, trả về văn bản không thay đổi
			return text;
		}

		// Định dạng số nguyên để thêm dấu phẩy
		String formattedNumber = decimalFormat.format(number);

		// Nếu văn bản ban đầu có dấu phẩy, hãy trả về kết quả với dấu phẩy
		if (hasComma) {
			return formattedNumber;
		}

		// Nếu không, hãy xóa dấu phẩy cuối cùng
		return formattedNumber.replaceAll(",$", "");
	}

	public static final double USDTOVND = 25335;
	public static final double USDTOAUD = 1.53;
	public static final double USDTOJPY = 155.56;
	public static final double USDTOKRW = 1376.12;
	double amountInUSD = 0.0;
	double amountVND = 0.0;
	double amountUSD = 0.0;
	double amountAUD = 0.0;
	double amountJPY = 0.0;
	double amountKRW = 0.0;

	private void handleExchangeButton() {
		checkTextField1();
		exchangeTextField2();
		exchangeTextField3();
		exchangeTextField4();
		exchangeTextField5();
		String reString = textField1.getText() + menuButton1.getText() + " = " + textField2.getText()
				+ menuButton2.getText() + " = " + textField3.getText() + menuButton3.getText() + " = "
				+ textField4.getText() + menuButton4.getText() + " = " + textField5.getText() + menuButton5.getText();
		// Add the values from text fields to the observable list
		items.add(0, reString);
	}

	public void checkTextField1() {
		if (menuButton1.getText().equals("VND")) {
			amountInUSD = 1 / (USDTOVND) * Double.parseDouble(textField1.getText().replace(",", ""));
		}

		if (menuButton1.getText().equals("USD")) {
			amountInUSD = Double.parseDouble(textField1.getText().replace(",", ""));
		}

		if (menuButton1.getText().equals("AUD")) {
			amountInUSD = 1 / (USDTOAUD) * Double.parseDouble(textField1.getText().replace(",", ""));
		}

		if (menuButton1.getText().equals("JPY")) {
			amountInUSD = 1 / (USDTOJPY) * Double.parseDouble(textField1.getText().replace(",", ""));
		}

		if (menuButton1.getText().equals("KRW")) {
			amountInUSD = 1 / (USDTOKRW) * Double.parseDouble(textField1.getText().replace(",", ""));
		}
		amountVND = USDTOVND * amountInUSD;
		amountUSD = amountInUSD;
		amountAUD = USDTOAUD * amountInUSD;
		amountJPY = USDTOJPY * amountInUSD;
		amountKRW = USDTOKRW * amountInUSD;
	}

	public void exchangeTextField2() {
		switch (menuButton2.getText()) {
		case "VND":
			textField2.setText(formatNumber(amountVND));
			break;

		case "USD":
			textField2.setText(formatNumber(amountUSD));
			break;

		case "AUD":
			textField2.setText(formatNumber(amountAUD));
			break;

		case "JPY":
			textField2.setText(formatNumber(amountJPY));
			break;

		case "KRW":
			textField2.setText(formatNumber(amountKRW));
			break;

		default:
			break;
		}
	}

	public void exchangeTextField3() {
		switch (menuButton3.getText()) {
		case "VND":
			textField3.setText(formatNumber(amountVND));
			break;

		case "USD":
			textField3.setText(formatNumber(amountUSD));
			break;

		case "AUD":
			textField3.setText(formatNumber(amountAUD));
			break;

		case "JPY":
			textField3.setText(formatNumber(amountJPY));
			break;

		case "KRW":
			textField3.setText(formatNumber(amountKRW));
			break;

		default:
			break;
		}
	}

	public void exchangeTextField4() {
		switch (menuButton4.getText()) {
		case "VND":
			textField4.setText(formatNumber(amountVND));
			break;

		case "USD":
			textField4.setText(formatNumber(amountUSD));
			break;

		case "AUD":
			textField4.setText(formatNumber(amountAUD));
			break;

		case "JPY":
			textField4.setText(formatNumber(amountJPY));
			break;

		case "KRW":
			textField4.setText(formatNumber(amountKRW));
			break;

		default:
			break;
		}
	}

	public void exchangeTextField5() {
		switch (menuButton5.getText()) {
		case "VND":
			textField5.setText(formatNumber(amountVND));
			break;

		case "USD":
			textField5.setText(formatNumber(amountUSD));
			break;

		case "AUD":
			textField5.setText(formatNumber(amountAUD));
			break;

		case "JPY":
			textField5.setText(formatNumber(amountJPY));
			break;

		case "KRW":
			textField5.setText(formatNumber(amountKRW));
			break;

		default:
			break;
		}
	}

	private void handleHistoryButton() {
		// Tạo một Stage mới
		Stage historyStage = new Stage();

		// Create VBox layout
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		root.setAlignment(Pos.CENTER);

		// Title label
		Label titleLabel = new Label("Exchange History");
		titleLabel.setFont(Font.font(17));
		titleLabel.setAlignment(Pos.CENTER);

		// Name label
		Label nameLabel = new Label("Truong Phu");
		nameLabel.setFont(Font.font(15));
		nameLabel.setAlignment(Pos.CENTER);

		// ListView for displaying history
		ListView<String> historyListView = new ListView<>();
		historyListView.setPrefSize(442, 395);
		historyListView.setItems(items);

		// Add children to the VBox
		root.getChildren().addAll(titleLabel, nameLabel, historyListView);

		// Create scene
		Scene scene = new Scene(root, 551, 461);

		// Set stage title and scene
		historyStage.setTitle("Exchange History");
		historyStage.setScene(scene);
		historyStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
