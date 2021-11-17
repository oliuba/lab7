package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class AuthorisationTest {
    private Authorisation ar;
    private Database db;

    @BeforeEach
    void setUp() {
        db = new Database();
        ar = new Authorisation();
    }

    @Test
    void authorize() {
        assertTrue(ar.authorize(db));
    }
}