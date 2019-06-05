Feature: This is to learn the use of Background in Cucumber

Background: Kaushik is  staying in Magarpatta and wants to fix new elec
Given Person stays in Magarpatta
|kaushik|
|Mohua|
And Approval wants to fix big elec

#This is the use of Tag, Runner will have this tag to run this step
@Basic      
@First
Scenario: Kaushik wants to fit AC
Given Kaushik has bought a AC
When Kaushik wants to fit the AC
Then Kaushik has to get written approval from PMS office

@Extensive
Scenario Outline: Magarpatta residents wants to set the home
Given Resident wants to decorate home
When "<Resident>" wants to use "<Electronic>"
Then get permission from PMS

Examples:
|Resident |Electronic|
|Kaushik  | AC|
|Mohua    | Water Purifier|   
