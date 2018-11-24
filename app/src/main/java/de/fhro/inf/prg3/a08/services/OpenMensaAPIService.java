package de.fhro.inf.prg3.a08.services;

import de.fhro.inf.prg3.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService
{
    private static OpenMensaAPIService instance;
    private OpenMensaAPI mensaApiInstance;

    private OpenMensaAPIService()
    {

    }

    /**
     * Creates an instance of this class if there isn't already one and returns it
     * (singleton)
     * @return the OpenMensaAPIService instance
     */
    public static OpenMensaAPIService getInstance()
    {
        if (instance == null)
        {
            instance = new OpenMensaAPIService();
        }

        return instance;
    }

    /**
     * Creates an Instance of the OpenMensaAPI if there isn't already one and returns it
     * @return the OpenMensaAPI instance
     */
    public OpenMensaAPI getApi()
    {
        if (mensaApiInstance == null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    /* no type adapters are required so the default GSON converter is fine */
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://openmensa.org/api/v2/")
                    .build();

            mensaApiInstance = retrofit.create(OpenMensaAPI.class);
        }

        return mensaApiInstance;
    }
}
