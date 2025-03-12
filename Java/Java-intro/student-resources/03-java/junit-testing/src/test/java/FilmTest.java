import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {

    private Film film18 = new Film("Alien", Film.RATING_18);
    private Film film15 = new Film("Aliens", Film.RATING_15);
    private Film film12 = new Film("Spiderman", Film.RATING_12);
    private Film filmPG = new Film("Coco", Film.RATING_PG);
    private Film filmU = new Film("Chitty Chitty Bang Bang", Film.RATING_U);


    @BeforeEach
    void setUp() {
        film18 = new Film("Alien", Film.RATING_18);
        film15 = new Film("Aliens", Film.RATING_15);
        film12 = new Film("Spiderman", Film.RATING_12);
        filmPG = new Film("Coco", Film.RATING_PG);
        filmU = new Film("Chitty Chitty Bang Bang", Film.RATING_U);
    }

    @Test
    @DisplayName("If 7 year old can view this film")
    void isAllowedToView_ValidInput_CorrectAnswer() {
        assertTrue(filmU.isAllowedToView(7));
        assertFalse(film15.isAllowedToView(7));
        assertTrue(film15.isAllowedToView(17));
        assertFalse(film12.isAllowedToView(9));
        assertTrue(film12.isAllowedToView(14));
        assertFalse(film18.isAllowedToView(9));
        assertTrue(film18.isAllowedToView(24));
        assertFalse(filmPG.isAllowedToView(3));
        assertTrue(filmPG.isAllowedToView(7));

    }

    @Test
    void
    isAllowedToView_FilmIs18RatedViewerUnder18_ReturnFalse() {
        assertFalse(film18.isAllowedToView(9));
        assertFalse(film18.isAllowedToView(12));
    }

    @Test
    void
    isAllowedToView_FilmIs18RatedViewerUnder18_ReturnTrue() {
        assertTrue(film18.isAllowedToView(109));
        assertTrue(film18.isAllowedToView(18));
    }
}