# demo-rest-api-asyn-ut

In this project, You can get songs, movies and tv shows.
The sources are apple and tvmaze.

## Requirements
- Java 8
- Maven

## Content
This project has the following features:
- Get data from Third Party API.
- Get data from two sources asynchronous.
- Unit Testing

## API
### Get results
**URL**: http://localhost:8080/search?term=<string>

**Method**: GET

**Headers**

| Key          | Value            |
| ------------ | ---------------- |
| Content-Type | application/json |

**Response**
```javascript
{
    "data": {
        "providers": {
            "Apple": {
                "Itunes": [
                    {
                        "kind": "song",
                        "artistName": "Pool Kids"
                    },
                    {
                        "kind": "song",
                        "artistName": "Reas & Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "ERSO"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Pool Kids"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "ERSO"
                    },
                    {
                        "kind": "song",
                        "artistName": "ERSO"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Pool Kids"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso"
                    },
                    {
                        "kind": "song",
                        "artistName": "ERSO"
                    },
                    {
                        "kind": "song",
                        "artistName": "Michael Giacchino"
                    },
                    {
                        "kind": "song",
                        "artistName": "Pool Kids"
                    },
                    {
                        "kind": "song",
                        "artistName": "Ihre Motive"
                    },
                    {
                        "kind": "song",
                        "artistName": "Vocal Arts Ensemble, Cincinnati Pops Orchestra & John Morris Russell"
                    },
                    {
                        "kind": "song",
                        "artistName": "Film Symphony Orchestra"
                    },
                    {
                        "kind": "song",
                        "artistName": "Noteservice Wind Band"
                    },
                    {
                        "kind": "song",
                        "artistName": "Erso Steiner & Berf Ali Polat"
                    },
                    {
                        "kind": "song",
                        "artistName": "SONOFFHISFATHER"
                    },
                    {
                        "kind": "song",
                        "artistName": "GVerse"
                    },
                    {
                        "kind": "song",
                        "artistName": "Roel Funcken"
                    },
                    {
                        "kind": "song",
                        "artistName": "Walid Sarkiss"
                    },
                    {
                        "kind": "song",
                        "artistName": "Amstefan"
                    },
                    {
                        "kind": "song",
                        "artistName": "Latios V"
                    }
                ]
            },
            "TvMaze": {
                "TvMaze": [
                    {
                        "score": 3.5298793,
                        "show": {
                            "name": "Ergo Proxy",
                            "url": "http://www.tvmaze.com/shows/8256/ergo-proxy"
                        }
                    },
                    {
                        "score": 2.2667768,
                        "show": {
                            "name": "The 10%ers",
                            "url": "http://www.tvmaze.com/shows/33004/the-10ers"
                        }
                    },
                    {
                        "score": 1.8564383,
                        "show": {
                            "name": "Eromanga Sensei",
                            "url": "http://www.tvmaze.com/shows/25979/eromanga-sensei"
                        }
                    },
                    {
                        "score": 1.7703975,
                        "show": {
                            "name": "Mentre ero via",
                            "url": "http://www.tvmaze.com/shows/47934/mentre-ero-via"
                        }
                    },
                    {
                        "score": 1.7703975,
                        "show": {
                            "name": "Facciamo che io ero",
                            "url": "http://www.tvmaze.com/shows/46402/facciamo-che-io-ero"
                        }
                    },
                    {
                        "score": 0.48440003,
                        "show": {
                            "name": "Waga seishun no Arukadia - Mugen kidō SSX",
                            "url": "http://www.tvmaze.com/shows/45828/waga-seishun-no-arukadia-mugen-kido-ssx"
                        }
                    }
                ]
            }
        }
    }
}
```