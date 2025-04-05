class Level3SupportHandler implements SupportHandler {
    public void handleRequest(Request request) {
        if(request.gePriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        // no next handler for Level 3
    }
}
