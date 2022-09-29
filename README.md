# NewRepository1
## The technologies used in this project includes selenium + java, Maven, POM, TestNG, WebdriverManager. The movie name can be changed from config.properties file.
The code browser is independent you can use any browser across chrome, firefox and edge from config.properties. 

PageLayer chaining is done in the sequence as : HomePageWikipedia-ContentPageWikipedia-HomePageIMDB-SearchPageIMDB-ContentPageIMDB
and the testLayers as: HomePageWikipediaTest-ContentPageWikipediaTest-HomePageIMDBTest-SearchPageIMDBTest-ContentPageIMDBTest
and the TestBase Class is extended to all these classes

The final TestCases which were asked in the assingment with assertion are done in the ContentPageIMDBTest

Result: one Test case i.e ValidateReleaseDateOfWikipediaAndIMDB will get failed as there text output dont match,
while other test case i.e. ValidateCountryOfWikipediaAndIMDB will get passed.
