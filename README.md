# DataExtraction

# Overview
In a constant loop, this program will pull job listings from indeed.com search the title and description for keywords will keep
track of how many times keywords are used, both per individual listing and overall, every time a new add is put up it will do this.
This data will be sent to a DB (So I can learn to integrate DB) then pulled and displayed on the screen.

#Filter Options
  date
  key words, by count(most to least) and by name ("How many times is java used")
  search phrases used 
  area
  Salary (Not provided in add will be removed from and search querry that has salary specified, In cases where it is filtered 
  		  "high" to "low" they will be after "low")

#Purpose
The purpose of this program is to, track and store the data related to jobs in a specific area so you can track what programming 
language, mark up, etc. has the most demand in your area.
