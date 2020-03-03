/*
 * Swagger Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.example.api;

import org.openapi.example.model.Error;
import org.openapi.example.model.Pet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetsApi
 */
@Ignore
public class PetsApiTest {

    private final PetsApi api = new PetsApi();

    
    /**
     * Create a pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPetsTest() {
        api.createPets();

        // TODO: test validations
    }
    
    /**
     * List all pets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPetsTest() {
        Integer limit = null;
        List<Pet> response = api.listPets(limit);

        // TODO: test validations
    }
    
    /**
     * Info for a specific pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showPetByIdTest() {
        String petId = null;
        Pet response = api.showPetById(petId);

        // TODO: test validations
    }
    
}