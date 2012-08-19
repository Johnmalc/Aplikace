This application connects and checks if the product exists or not. Possible work with many websites, but only one is tested (max. 2). 

# Documentation #

<ol>What user does :
<li>Start the programm.</li>
<li>Click "connect" to establish a new connection to the website. - **removed** with version 1.3 </li>
<li>After sucessfull connection, user adds numbers (copy and paste).</li>
<li>Now the user must click on "check" and programm will check all numbers if they exist or not.</li>
</ol>

For future (potential TODO)
========
- [Desktop integration](http://www.oracle.com/technetwork/articles/javase/desktop-api-142259.html)
- Tons of unused code should be commited with comments.




# Changelog - "huge diary" #


**1.3 "Nocona"**

- Accepts <= 8 numbers. Done but probably not needed. 
- Solved: display console message in GUI, instead of console. Yeah. And deleted console.java
Special font for right text area
- The last application using Swing, next time only SWT. Look on that options
- Removed html jsoup parser - no need, and questionable http apache client. Will se if needed.
- Have no idea why i deleted application name > restored
- Connection may be not needed, but search func. is essential, because of that connection button removed.
- "Search" func. very, very partial. A lot of work to do. Just displays html code. > make it if statement. Now in console, need in that text area.
- Sunday: work on that search func. and send it
- Changed comments to different type.
- Improved & added a new approach for system tray (icons), now with exit popup. 
- A lot of unused code in different file. Not commited. But very useful for future.





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

Improvement allowed; pull requests will be tested and accepted. 

# Credits :  
- John Malc (cincenko@seznam.cz) - idea and code