import React, { useState } from 'react';
import useTitle from './useTitle';
import AuthContext from './AuthContext';
import MyComponent from './MyComponent';

function App() {
  const userName = 'john';

  return (
    <AuthContext.Provider value={userName}>
      <MyComponent />
    </AuthContext.Provider>
  );
};

export default App;
