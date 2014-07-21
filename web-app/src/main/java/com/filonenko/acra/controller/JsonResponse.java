package com.filonenko.acra.controller;

/**
 * Created with IntelliJ IDEA.
 * User: Viktor
 * Date: 21.07.14
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
public class JsonResponse {
    private String status = "";
    private String errorMessage = "";

    public JsonResponse(String status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }
}
