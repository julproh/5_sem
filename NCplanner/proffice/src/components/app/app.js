import React from "react";
import PrivateInfo from "../private-info";

const App = () => {

    const personData = [
         'Bob',
         'Bobov',
         'Developer'
    ]
    return (
        PrivateInfo(personData));
}

export  default App;