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

**1.4 "NOT finished"**
- httpclient ale nechat to kde se to zapisuje. != http://www.xxx.cz/vyrobek-nenalezen
Toto si potreboval? Pokud chces zadavat vic cisel (rucne), das to do smycky. A program ukoncis napriklad stiskem enteru bez zadaneho textu. Takze napr.:

> do{
> ...
> } while(!retezec.equals("")};
> 
> K dalsi otazce:
> E-shop rozeznava, zda se vyhledava vyrobek nebo fulltext - proto dve stranky. Pokud zadas cislo vyrobku, e-shop bude hledat pouze v cische vyrobku. Pokud zadny nenajde (resp. pokud je vyrobek nastaven jako neaktivni), zobrazi Vyrobek neexistuje. Pokud se ale hleda fulltextem, pak je to zase ze hledany vyraz nebyl nalezen.
> 
> V tuto chvili plati, ze cislo je cislem vyrobku, pokud se zada sestimistny retezec obsahujici pouze cisla (tzn. [0-9]{6}). Bude se to ale zanedlouho menit. Varianty jsou rozsireni na 8 nebo zacleneni alfanumerickych znaku.
> Takze v tuto chvili to muzes rozlisovat: odpovida zadany text regularnimu vyrazu [0-9]{6} ? pokud ne, nemusis dal pokracovat. Pokud ano, zkus zadat url adresu:
> http://www.xxx.cz/<[0-9]{6}(tot je rychlejsi zapis). Pokud dostanes "Vyrobek nenalezen", pak vyrobek > neexistuje. Jinak muzes prohlasit, ze vyrobek existuje.
> Nemusis se snazit zjistit, zda stranka je "Vyrobek nenalezen". Bez na to opacne a zjistuj, zda vyrobek je nalezen. V takovem pripade server presmeruje na spravnou url adresu vyrobku, ktery ma tvar nazvu vyrobku ".k" cislo vyrobku (nemusi se shodovat se zadanym).
> K tomuto reseni nemusis ani cist celou stranku, ale pouze hlavicky odpovedi, a vsechny se ohodne zrychli.
> 





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