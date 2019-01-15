Feature: Login to Free CRM website

@FirstHook
@Basic
Scenario: 1-Login UserId and Password
Given User is on Login Page of Free CRM

@SecondHook
@Basic
Scenario: 2-Home Page verification
Given User is on Home page of Free CRM

@Basic @Additional
Scenario: 3-Calender Page verification
Given User is on calender page of Free CRM

@Basic @Additional
Scenario: 4-Companies Page verification
Given User is on companies page of Free CRM

@Additional
Scenario: 5-Contact Page verification
Given User is on contact page of Free CRM

@Basic @Advanced
Scenario: 6-Deals Page verification
Given User is on deals page of Free CRM

@Additional
Scenario: 7-Tasks Page verification
Given User is on tasks page of Free CRM

@Advanced
Scenario: 8-Call Page verification
Given User is on call page of Free CRM

@Advanced
Scenario: 9-Email Page verification
Given User is on email page of Free CRM
