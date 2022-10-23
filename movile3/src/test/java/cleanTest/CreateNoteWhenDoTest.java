package cleanTest;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.DeleteNote;
import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.util.Date;

public class CreateNoteWhenDoTest {
    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    DeleteNote deleteNote = new DeleteNote();
    @Test
    public void verifyCreateNewNote(){
        String title="Cato";
        String note="esta es una nota";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not created");

    }

    @Test
    public void verifyEditionNewNote() throws InterruptedException {
        String title="tarea1";
        String newNote="esta es una nota editada";
        String newTitle="tarea2";
        String note="esta es una nota";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        mainScreen.selectNote(title);
        createNoteForm.titleTxtBox.setText(newTitle);
        createNoteForm.noteTxtBox.setText(newNote);
        createNoteForm.saveButton.click();


        Assertions.assertTrue(mainScreen.isNoteDisplayed(newTitle),
                "ERROR, the note was not edit");
        Thread.sleep(2000);

    }


    @Test
    public void verifyDeleteNote() throws InterruptedException {
        String title="NotaTarea";
        String note="esta es una nota";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        mainScreen.selectNote(title);
        deleteNote.deleteNoteButton.click();
        Thread.sleep(2000);
        deleteNote.confirmDeleteNoteButton.click();

        Assertions.assertTrue(!mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not delete");
        Thread.sleep(2000);
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }



}
