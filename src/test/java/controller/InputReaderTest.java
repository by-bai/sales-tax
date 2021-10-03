package controller;

import model.Item;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {

    @Test
    public void throw_exception_if_file_does_not_exist() {
        assertThrows(FileNotFoundException.class,
                () -> InputReader.readFile("hello.txt"));
    }

    @Test
    public void return_list_of_items_if_file_exists() throws FileNotFoundException {
        assertFalse(InputReader.readFile("./data/input1.txt").isEmpty());
    }


}