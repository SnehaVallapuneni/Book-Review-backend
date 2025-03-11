package com.bookshelf.entities;


public class BookEntity {

	    private String id;
        private VolumeInfo volumeInfo;
        
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public VolumeInfo getVolumeInfo() {
            return volumeInfo;
        }

        public void setVolumeInfo(VolumeInfo volumeInfo) {
            this.volumeInfo = volumeInfo;
        }

        @Override
        public String toString() {
            return "BookEntity{" +
                    "id='" + id + '\'' +
                    ", volumeInfo=" + volumeInfo +
                    '}';
        }
        
}
