package controller;

import model.Item;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {

    @Test
    public void throw_exception_if_file_does_not_exist() {
        // Test Failed https://stackoverflow.com/questions/2469911/how-do-i-assert-my-exception-message-with-junit-test-annotation
        FileNotFoundException exception = assertThrows(FileNotFoundException.class,
                () -> { throw new FileNotFoundException("File does not exist!"); });
        assertEquals(InputReader.readFile("hello.txt"), exception.getMessage());
    }

    @Test
    public void return_list_of_items_if_file_exists() {
        assertFalse(InputReader.readFile("./data/input1.txt").isEmpty());
    }


}