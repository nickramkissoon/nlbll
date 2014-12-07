nlbll
=====
import java.util.*;
public class WordSearch{
private char[][] grid;
private boolean up;
private boolean down;
private boolean left;
private boolean right;
private ArrayList<String> wordList = new ArrayList<String>();
private int numWords;
/*public ArrayList<String> loadDictionary() {
String s = "zzz";
ArrayList<String> dictionary = new ArrayList<String>();
try {
FileReader f = new FileReader("wordlist.txt");
BufferedReader b = new BufferedReader(f);
while( s != null ) {
s = b.readLine();
if ( s != null )
dictionary.add(s);
}
}
catch (IOException e) {}
return dictionary;
}
*/
//Default Constructor
public WordSearch(){
grid = new char[10][10];
for (int i = 0; i < grid.length; i++)
for (int j = 0; j < grid[i].length; j++)
grid[i][j] = '-';
}
//Constructor With Parameters
public WordSearch(int rows, int cols){
grid = new char[rows][cols];
for (int i = 0; i < grid.length; i++)
for (int j = 0; j < grid[i].length; j++)
grid[i][j] = '-';
}
//toString()
public String toString(){
String a = "";
for (int i = 0; i < grid.length; i++) {
for (int j = 0; j < grid[i].length; j++)
a += grid[i][j] + " ";
a += "\n";
}
for (int i = 0; i<wordList.size(); i++){
a+=wordList.get(i)+"/n";
}
return a;
}
//fillGrid()
public void fillGrid(){
for (int i = 0; i < grid.length; i++) {
for (int j = 0; j < grid[i].length; j++){
if (grid[i][j]=='-'){
Random rand = new Random();
int r = rand.nextInt(26)+65;
grid[i][j]= (char)r;
}
}
}
}
//main
public static void main(String[] args){
//toString() Test--------------------------------------
/*
WordSearch s = new WordSearch();
for (int i = 0; i < s.grid.length; i++)
for (int j = 0; j < s.grid[i].length; j++)
s.grid[i][j] = 'a';
System.out.println(s.toString());
*/
//-------------------------------------------------------
WordSearch ws = new WordSearch();
ws.fillGrid();
System.out.println(ws);
}
}
