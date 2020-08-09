all:
	javac --module-path $(PATH_TO_FX) --add-modules javafx.controls,javafx.fxml -d out *.java

run:
	java --class-path ./out --module-path $(PATH_TO_FX) --add-modules javafx.controls,javafx.fxml test02.Test02

clean:
	rm -f -r out

