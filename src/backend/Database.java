package backend;

import backend.Mix;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Database {

    private String filename;
    private ArrayList<Mix> records = new ArrayList<>();
    
    public Database(String filename) {
        this.filename = filename;
    }

    public ArrayList<Mix> getRecords() {
        return records;
    }

    public void readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            records.add(createRecordFrom(line));
        }
    }

    public abstract Mix createRecordFrom(String key);
    
    public ArrayList<Mix> returnAllRecords() {
        return records;
    }
    
    public void saveToFile() throws IOException {
          try ( FileWriter bw = new FileWriter(filename, false);) {// true appends ,false overwrite
            for (int i = 0; i < records.size(); i++) {
                bw.write(records.get(i).lineRepresentation() + System.lineSeparator());//ensuring that each record is written on a new line in the file
            }
            bw.close();
        }
    }
    
        public boolean contains(String key) {
        return records.stream().anyMatch(record -> record.getSearchKey().equals(key));
    }
    
    public void insertRecord(Mix record) {
        records.add(record);
    }
    
    public void deleteRecord(String key) {
        Mix record = getRecord(key);
        if (record != null) {
            records.remove(record);
        }
    }
    
    public Mix getRecord(String key) {
   //     boolean contains = records.contains(key);
        return records.stream().filter(record -> record.getSearchKey().equals(key)).findFirst().orElse(null);
    }
    
    public void setRecords(ArrayList<Mix> records) {
        this.records = records;
    }
    
    public String getFilename() {
        return filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
}
