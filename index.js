import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';  // 기본 스타일을 추가하거나 필요시 삭제하세요.
import App from './App';  // 메인 컴포넌트 (필요시 `App.js` 파일이 있어야 합니다.)
import reportWebVitals from './reportWebVitals';  // 웹 성능 측정을 위한 기본 파일

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')  // public/index.html 파일의 <div id="root"></div>에 렌더링됨
);

// 웹 성능 측정
reportWebVitals();
