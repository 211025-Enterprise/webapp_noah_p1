package com.webapp.service;

import com.wpax.WPax;

import java.io.IOException;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.http.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webapp.models.Cat;

public class CatService {
    private static ObjectMapper mapper;

    public void getAllCats(HttpServletRequest req, HttpServletResponse res) {
        try {
            res.getWriter().println(mapper.writeValueAsString(WPax.getAll(Cat.class).execute()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // public void createCat(HttpServletRequest req, HttpServletResponse res) {
    // try {
    // Cat cat =
    // mapper.readValue(req.getReader().lines().collect(Collectors.joining()),
    // Cat.class);
    // res.getWriter().println(mapper.writeValueAsString(WPax.create(Cat.class)));
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    // public void updateCat(HttpServletRequest req, HttpServletResponse res) {
    // try {
    // Cat cat =
    // mapper.readValue(req.getReader().lines().collect(Collectors.joining()),
    // Cat.class);
    // res.getWriter().println(mapper.writeValueAsString(WPax.update(Cat.class)));
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    // public void deleteCat(HttpServletRequest req, HttpServletResponse res) {
    // try {
    // res.getWriter().println(mapper.writeValueAsString(WPax.getAll(Cat.class)));
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
}
