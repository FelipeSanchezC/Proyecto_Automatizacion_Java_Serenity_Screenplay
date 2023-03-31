package utilities.ValidatePages;

import net.serenitybdd.screenplay.targets.Target;
import userInterface.ValidaPages.PageContactUsUi;

public class dataPageContactUs {

    public final String nameText, emailText, subjectText, msnText;
    public final Target targetName, targetEmail, targetSubject, targetMessage;

    public dataPageContactUs(String nameText, String emailText, String subjectText, String msnText, Target targetName, Target targetEmail, Target targetSubject, Target targetMessage) {
        this.nameText = nameText;
        this.emailText = emailText;
        this.subjectText = subjectText;
        this.msnText = msnText;
        this.targetName = targetName;
        this.targetEmail = targetEmail;
        this.targetSubject = targetSubject;
        this.targetMessage = targetMessage;
    }

    public static dataPageContactUs dataFormulario() {
        return new dataPageContactUs(
                ContantesContacUs.NAME_CONTACT_US,
                ContantesContacUs.EMAIL_CONTACT_US,
                ContantesContacUs.SUBJECT_CONTACT_US,
                ContantesContacUs.MESSAGE_CONTACT_US,

                PageContactUsUi.INPUT_NAME_CONTACT_US,
                PageContactUsUi.INPUT_EMAIL_CONTACT_US,
                PageContactUsUi.INPUT_SUBJECT_CONTACT_US,
                PageContactUsUi.INPUT_MESSAGE_CONTACT_US
        );
    }

}
