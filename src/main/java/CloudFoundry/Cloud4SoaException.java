package cloudfoundry;

public class Cloud4SoaException extends Exception {

    String msg;

//----------------------------------------------
// Default constructor - initializes instance variable to unknown

  public Cloud4SoaException()
  {
    super();             // call superclass constructor
    msg = "Error caused in Cloud4SOA Adapter";
  }

//-----------------------------------------------
// Constructor that receives some kind of message that is saved in an instance variable.
  public Cloud4SoaException(String err)
  {
    super(err);     // call super class constructor
    msg = err;  // save message
  }


//------------------------------------------------
// public method, callable by exception catcher. It returns the error message.

  public String getError()
  {
    return msg;
  }


}

