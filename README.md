# Phone-Book
DATA STRUCTURES PROJECT REPORT
We construct PersonInfo class to hold a persons informations . We defined name,surname,address,work phone,home phone,cell phone fields .We created phoneBook object which is held ArrayList collection , in String type.
We constructed getInfo method which has int select variable to get a person’s informations from user.We defined an array which has name info and it has String variables . defined a variable which has name info , and assigned it to array’s first element.In the DataFirstTry class a console menu is introduced to user .If use select 1 program print”Please enter a name” , user will enter a name . We sav ed it in info variable and added name field , then assigned info to infoArray’s first element.When user select 2 , program wants a surname information from user .User will enter a surname and program save it with scan.nextLine() method with info variable.And this info variavle is assigned to infoArray’s second element.When user select 3 program wants user to enter address.After user enter address program save it info variable in the memory .This address is added address field .And info variable is assigned to infoArray’s third element.When user enter 4 , program wants work number from user.After user enter its work number , program save it in the memory,add it to work_phone field and assigned it infoArray’s 4th element. When user enter 5 , program wants home phone number from user .After user enter its phone home number , program save it as info in the memory, add it home_phone field , assign it infoArray’s 5th element.When user select 6 , program wants cell phone number from user , save it memory , add it to cell phone field
We costruct a showInfo method to print personel information
In DataFirstTry method we used while loop , when boolean true , it works. Defined an selection variable which has integer value , defined nameAsked which has String type. We printed to ask user what it want to do. When it enter 1 program will search a person , when it enter 2 program will search a phone number , when it enter 3 program create a new person . When it enter 4 program list all people.When user enter 5 program end and exit . When user enter program warn user to enter valid value.After user enter a value program hold it in the memory
We used if control state to search person or phone number .When user enter 1 or 2 program works . We defined an PersonControl variable and used counter integer variable which starts from 0.We used 2 for loops inside if statement . Outer for loop represent person which we searc.Inside for loop represent length size . In the inside if loop means if personControl’s size varible which is in the phonebook equall to nameAsked variable which we search name of person , program will increase counter one , than program print which person we searched . We limited counter with one
When user select 2 , it means program will search a phone number.Program wants a number to search.After user enter number program hold it in the memory.We used two for loop to search number . Outer for loop controls size of Person info which is in the phonebook.If person control value smaller than PersonInfo size , program enter second for loop which is inside.Inside for loop control length of personControl . Length variable starts from 3 , until length 5 , for loop works . We used if control statement . It controls personControl length of Person info . If it is equal to nameAsked , it increased counter one . We print the number as counter which we search
