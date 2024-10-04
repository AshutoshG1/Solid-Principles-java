package solid.ocp_problem;

public class Notificationservice {

    public void sendOTP(String medium) {

        if (medium.equals("email")){
            //write email related logic
            //use javaMailSenderAPI
        }
        if (medium.equals("mobile")){
            //write logic using twilio api
        }

    }

}
