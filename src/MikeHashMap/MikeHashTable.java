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

    public String get(int key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void put(int key, String value) {

        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        var bucket = getOrCreateBucket(key);
        bucket.addLast(new Entry(key, value));

    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private Entry getEntry(int key) {
        var bucket = entries[key];
        if (bucket == null) return null;
        for (var entry : bucket) {
            if (entry.key == key) {
                return entry;
            }
        }
        return null;
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var bucket = getBucket(key);
        if (bucket == null) {
            bucket = new LinkedList<>();
        }
        return bucket;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public void remove(int key) {
        //先找到对应的bucket
        var entry = getEntry(key);
        var bucket = getBucket(key);
        if (entry == null) throw new IllegalStateException();
        getBucket(key).remove(key);
        throw new IllegalStateException();

    }
}
}
