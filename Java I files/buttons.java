	private HBox topHB(){
		ToggleGroup colors = new ToggleGroup();

		RadioButton red = new RadioButton("Red");
		red.setTextFill(Color.RED);
		red.setPadding(new Insets(5, 5, 5, 0));
		red.setToggleGroup(colors);

		RadioButton yellow = new RadioButton("Yellow");
		yellow.setTextFill(Color.YELLOW);
		yellow.setPadding(new Insets(5, 5, 5, 0));
		yellow.setToggleGroup(colors);

		RadioButton white = new RadioButton("White");
		white.setSelected(true);
		white.setTextFill(Color.WHITE);
		white.setPadding(new Insets(5, 5, 5, 0));
		white.setToggleGroup(colors);

		RadioButton orange = new RadioButton("Orange");
		orange.setTextFill(Color.ORANGE);
		orange.setPadding(new Insets(5, 5, 5, 0));
		orange.setToggleGroup(colors);

		RadioButton green = new RadioButton("Green");
		green.setTextFill(Color.GREEN);
		green.setPadding(new Insets(5, 5, 5, 0));
		green.setToggleGroup(colors);


		HBox topHBox = new HBox();
		topHBox.getChildren().addAll(red, yellow, white, orange, green);
		topHBox.setMargin(red, new Insets(0, 0, 0, 5));
		return topHBox;
	}