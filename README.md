# Insta Bot

<img src="https://www.selenium.dev/images/selenium_logo_large.png" width="160" height="80" />

Hi! This is a bot that saves your credentials and just by a single click fills the instagram website with your credentials,logs you in and then like the first picture visible.


# To run
Run the following command in terminal:

    java -jar Bot.jar
Enter your username:

     Enter your Username: 
     Your_username
Enter your password:

    Enter your password:
    Your_password
If successful then you will see:

    Starting ChromeDriver 88.0.4324.96 (68dba2d8a0b149a1d3afac56fa74648032bcf46b-refs/branch-heads/4324@{#1784}) on port 37172
    Only local connections are allowed.
    Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
    ChromeDriver was started successfully.

If unsuccessful open project in Eclipse and then got to Selenium.java

    options.setBinary(new File("Enter your chrome binary file location"));

