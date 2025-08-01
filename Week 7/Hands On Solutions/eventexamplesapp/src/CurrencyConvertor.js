import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = () => {
    const value = parseFloat(rupees);
    if (!isNaN(value)) {
      const converted = (value / 90).toFixed(2); // Assume 1 Euro = ₹90
      setEuro(converted);
    } else {
      alert("Enter a valid number!");
    }
  };

  return (
    <div className="currency-convertor">
      <h2>💱 Currency Convertor</h2>
      <input
        type="text"
        placeholder="Enter amount in ₹"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>

      {euro && <p>Equivalent in €: {euro}</p>}
    </div>
  );
}

export default CurrencyConvertor;
