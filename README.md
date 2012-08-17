This application connects and checks if the product exists or not. Possible works with many websites, but only one is tested (max. 2). 

# Documentation #

<ol>What user does :
<li>Start the programm.</li>
<li>Click "connect" to establish a new connection to the website.</li>
<li>After sucessfull connection, user adds numbers (copy and paste).</li>
<li>Now the user must click on "check" and programm will check all numbers if they exist or not.</li>
</ol>

For future (potential TODO)
========
- [Desktop integration](http://www.oracle.com/technetwork/articles/javase/desktop-api-142259.html)




# Changelog #


**1.3 "Nocona"**

- Accepts <= 8 numbers. Done but probably not needed. 
- Solved: display console message in GUI, instead of console. Yeah. And deleted console.java
Special font for right text area
- The last application using Swing, next time only SWT. Look on that options
- Removed html jsoup parser - no need
- Have no idea why i deleted application name > restored
- Connection may be not needed, but search func. is essential 








**1.2 "Late Night"**

- Added Console.java due to GUI output (not ready & working).
- Added ScrollPane and disabled RightPanel to be editible.
- Added System Tray works **YEAH**  
- Added and improved comments, including more free lines between them.
- Added "Documentation" - at least a few lines
- Connection to any website should work now, but stll shows in the console, not in textarea.
- Console.java won't be needed, probably.
- Eclipse JUNO doesn't support horizonatal lines like Sublime Text 2, fuck them.
- Connection look almost done, need just search feauture. 

**1.1**

- Updated icons and comments.
- Decision about a new class file only for http connection.
- No [Maven](http://maven.apache.org), ever.
- Uploaded to Github for faster editing.

**1.0**

- Initial release.
- TODO icons and http connection.

# Licence #

Improvement allowed; pull requests will be tested and excepted. 

# Credits :  
- John Malc (cincenko@seznam.cz) - idea and code