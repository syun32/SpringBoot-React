import React, { useState } from 'react';

function MyList() {
    const [text, setText] = useState('');

    const handleSubmit = (event) => {
        alert(`You typed: ${text}`);
        event.preventDefault();
    }

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" onChange={event => setText(event.target.value)} value={text}/>
            <input type="submit" value="Press me"/>
        </form>
    )
}

export default MyList;