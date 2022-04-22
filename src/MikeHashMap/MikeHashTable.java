package MikeHashMap;

import java.util.LinkedList;

public class MikeHashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }


    }
    //Bucket的容器，槽位，初始为5个
    private LinkedList<Entry>[] entries = new LinkedList[5];
    public String get(int key){
        var index=hash(key);
        var bucket=entries[index];
        if(bucket!=null){
            for(var entry:bucket){
                if(entry.key==key){
                    return  entry.value;
                }
            }
        }
        return null;
    }
    public void put(int key, String value) {
        //计算槽位
        var index = hash(key);

        //如果没有对应的槽位，则新建一个槽位
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
            var bucket=entries[index];
            var entry = new Entry(key, value);
            bucket.addLast(entry);
        }
else{
    var bucket=entries[index];
    var newEntry=new Entry(key,value);
            for(var entry:bucket){
                if(entry.key==key){
                    System.out.println(key);
                    entry.value=value;
                    return;
                }

            }
            bucket.addLast(newEntry);
        }
    }

    private int hash(int key) {
        return key % entries.length;
    }
}
