package nightdev.chapter2Example;

aspect FaultHandler {
    private boolean Server.disabled = false;

           private void reportFault() {
             System.out.println("Failure! Please fix it.");
           }

           public static void fixServer(Server s) {
             s.disabled = false;
           }

           pointcut services(Server s): target(s) && call(public * *(..));

           before(Server s): services(s) {
             if (s.disabled) throw new DisabledException();
           }

           after(Server s) throwing (FaultException e): services(s) {
             s.disabled = true;
             reportFault();
           }
         }