import React from "react";
import PrivateInfoPoint from "../private-info-points";

const PrivateInfo = (personData) => {
    const  points = [
        {label: 'Имя', id: 1},
        {label: 'Фамилия', id:2},
        {label: 'Должность', id:3}
    ];
    const elements = points.map((item) => {
        const {id, ...itemProps} = item;
        return (
            <li key={id}>
                <PrivateInfoPoint {...item}/> {personData[item.id - 1]}
            </li>
        )
    });

    return (
        <ul> {elements} </ul>
    );
}


export default PrivateInfo;