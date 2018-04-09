package com.sann.assignment.model

class JobAttachment {
    private var FileDescription: String? = null

    private var FileURLThumb: String? = null

    private var FileURL: String? = null

    fun getFileDescription(): String? {
        return FileDescription
    }

    fun setFileDescription(FileDescription: String) {
        this.FileDescription = FileDescription
    }

    fun getFileURLThumb(): String? {
        return FileURLThumb
    }

    fun setFileURLThumb(FileURLThumb: String) {
        this.FileURLThumb = FileURLThumb
    }

    fun getFileURL(): String? {
        return FileURL
    }

    fun setFileURL(FileURL: String) {
        this.FileURL = FileURL
    }

}