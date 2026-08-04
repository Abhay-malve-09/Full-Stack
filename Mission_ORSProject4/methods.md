# search methods
	- ## findByLogin
		- return type `userbean`
		- search one record
			- ### Code
				- same as pk
				- can use in inserting data.
				- you are going to add or insert a data where `loginId` is already present in database
					- so before adding data for ex. before try catch search using `bean.getLoginId()` and if data get searched then you can throws duplicate records found exception and if not searched add in the database.
						- to avoid duplicated records.
				- in the code:
					- `bean.getLoginId()` when we get id from main and in `findByLogin` that id got passed and query gets to run and if the records found then we user bean object so we will store in user bean object `existBean`
						- if `existBean` is not null throw new exception *login already exists*
					- for ex.
						- in add method we set bean's id = 10 and loginId = "ayan@gmail.com"
						- that bean is being sent to model's add method.
						- so `UserBean existBean = findByLogin(bean.getLoginId());` so `ayan@gmail.com` gets passed here because login Id is string type `bean.setLoginId(rs.getString("loginId"));` from `findByLogin(String loginId)`
							- the `ayan@gmail.com` will be searched for in database and returns bean and we stored that in `existBean`
							- and this condition gets true:
								- ```java
								  if (existBean != null) {
								  			throw new RuntimeException("loginId already exists");
								  		}
								  // code gets stopped here. and data doesn't add.
								  // if use try catch the exception get handled and the code below it gets executed
								  // and database gets inserted hence duplicate records inserted :/
								  
								  ```
	- ## authenticate
	  collapsed:: true
		- return type `userbean`
			- reason why we use return type userbean
				- because it searches one record
			- ### Code
				- if one of them viz. login or password is wrong then access denied
				- 2 ways to write this method:
					- use same code written in `findbypk`
					- checks if database password or password sent by `findByLogin` and user written password in authenticate are same or not
						- `findByLogin(loginId);` we are sending loginId already using model's bean
							- search the record using `loginId` and in the record or row you get password too
								- then that password and the password which you get from here `authenticate(String loginId, String password)` are same then:
									- can login and returns bean
									- otherwise return null.
						- #### benefits:
							- no need to run query and other lengthy code
					-
	- ## findByPk
		- return type `userbean`
		- record not found exception
		- search one record
		- gets id, and all other fields; store in user bean object and return user bean object and print using sysout from bean
			- ### Code
				- name the method as per query
				- `select * from st_user where id = ?`
					- in the place of ? id will come from `findByPk(int id)`
					- for example we send id = 1 then query returns first row that row gets stored in result set further gets `set` in bean using while loop, additionally return that bean object
						- bean was null but now if it gets the row then it will get the memory and create the object
						- at first we used to print `rs.getInt("id")` instead of that we set it in bean
				- in test :
					- no need to create `UserModel`'s object everytime
						- instead make it static
						- can use this object in whole class and it is fixed now
						- don't make Bean as static because it' value keep on changing using setter and getters. so every-time it's object should be newly created
					- ```java
					  UserBean bean = new UserBean();
					  bean = model.findByPk(10);
					  ```
						- model's `findByPk()` returns bean the one we get from resultset hence need to be stored in newly created bean object.
						- so that we get row 1 which is set in bean
						- now need to print it but before that we need a condition what if bean is null
						- if bean is not null then print  using `bean.getId()` else throw runtime exception like record not found
							- can custom exception too
						- if id sent is 10 which is not available in record, then query will run but bean remain null and we get exception in main
						-
						-
					-
		-
	- ## search with pagination
	  collapsed:: true
		- return type `list`
			- reason:
			  collapsed:: true
				- searches whole records
				- multiple data stores in list
				- list can store multiple userbean object
			- generic `<userbean>`
		- database searched will be stored in bean
		- transaction handling won't be done here as no change in database.
- Business Logic:
	- code that checks whether the data present in database
- Data Access Logic
	- Code that communicates with the database to perform operations such as insert, update, delete, and search.
- can create rollNo. in student and check if same rollNo. exists or not in add method if rollNo. found throw exception roll no already exists.