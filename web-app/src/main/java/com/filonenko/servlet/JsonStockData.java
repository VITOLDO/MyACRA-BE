package com.filonenko.servlet;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author: Viktor, Filonenko
 * @since: 17.06.13
 */
public class JsonStockData extends HttpServlet {
    public static final Logger LOG = LoggerFactory.getLogger(JsonStockData.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.trace("enter doPost");

        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = req.getReader();
            while ((line = reader.readLine()) != null) jb.append(line);

        } catch (Exception e) {
            LOG.error("Something went wrong {}", e);
        }

        LOG.debug("Current JSON is: " + jb.toString());

        try {
            JSONObject obj = new JSONObject(jb.toString());
        } catch (JSONException e) {
            LOG.error("Parser exception {}", e);
        }

        // Work with the data using methods like...
        // int someInt = jsonObject.getInt("intParamName");
        // String someString = jsonObject.getString("stringParamName");
        // JSONObject nestedObj = jsonObject.getJSONObject("nestedObjName");
        // JSONArray arr = jsonObject.getJSONArray("arrayParamName");
        // etc...

        LOG.debug(req.getHeaderNames().toString());
    }
}
