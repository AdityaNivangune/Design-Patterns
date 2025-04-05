class User {
    private final int userId;
    private final String userName;
    private final String emailId;

    private User(userBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.userName +" : "+this.emailId + " : "+this.userId;
    }

    // inner class to create object
    static class userBuilder {
        private int userId;
        private String userName;
        private String emailId;

        public userBuilder() {

        }
        
        public userBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }
        public userBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public userBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}