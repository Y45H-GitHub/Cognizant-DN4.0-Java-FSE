import React from "react";
import "./App.css";

function App() {
  const officeList = [
    {
      name: "WeWork Koramangala",
      rent: 55000,
      address: "Koramangala, Bangalore",
      image:
        "https://images.unsplash.com/photo-1624555130581-1d9cca783bc0?q=80&w=1171&auto=format&fit=crop",
    },
    {
      name: "Awfis BKC",
      rent: 75000,
      address: "BKC, Mumbai",
      image:
        "https://plus.unsplash.com/premium_photo-1670315264879-59cc6b15db5f?q=80&w=1171&auto=format&fit=crop",
    },
    {
      name: "SmartWorks Noida",
      rent: 62000,
      address: "Sector 62, Noida",
      image:
        "https://images.unsplash.com/photo-1531973576160-7125cd663d86?q=80&w=1170&auto=format&fit=crop",
    },
    {
      name: "Regus Pune",
      rent: 45000,
      address: "Viman Nagar, Pune",
      image:
        "https://images.unsplash.com/photo-1497366811353-6870744d04b2?q=80&w=1169&auto=format&fit=crop",
    },
  ];

  return (
    <div className="App">
      <h1>🏢 Office Space Rental App</h1>

      {/* Horizontal Gallery */}
      <div className="office-gallery">
        {officeList.map((office, index) => (
          <div key={index} className="office-card">
            <img src={office.image} alt={office.name} />
            <h2>{office.name}</h2>
            <p>📍 {office.address}</p>
            <p
              className="rent"
              style={{ color: office.rent < 60000 ? "red" : "green" }}
            >
              💰 Rent: ₹{office.rent}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
